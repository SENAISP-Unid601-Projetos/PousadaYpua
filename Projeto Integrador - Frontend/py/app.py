import sqlite3
from flask import Flask, request, jsonify
from flask_cors import CORS
from analiseSentimento import calcular_star_rating  # Corrija o caminho conforme necessário

app = Flask(__name__)
CORS(app)  # Permite CORS para todas as rotas do app

# Função para conectar ao banco de dados
def conectar_db():
    return sqlite3.connect('db/feedbacks.db')

# Rota para análise de sentimentos e cálculo do star rating
@app.route('/analisar_feedback', methods=['POST'])
def analisar_feedback():
    data = request.json
    feedback = data.get('feedback', '')
    
    # Análise de sentimentos
    estrelas = calcular_star_rating(feedback)

    return jsonify({'estrelas': estrelas})

# Rota para carregar feedbacks
@app.route('/carregar_feedbacks', methods=['GET'])
def carregar_feedbacks():
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute("SELECT quarto, feedback, estrelas FROM feedbacks")
    rows = cursor.fetchall()
    conn.close()

    # Organiza feedbacks por quarto
    feedbacks_por_quarto = {}
    for quarto, feedback, estrelas in rows:
        if quarto not in feedbacks_por_quarto:
            feedbacks_por_quarto[quarto] = []
        feedbacks_por_quarto[quarto].append({'texto': feedback, 'estrelas': estrelas})

    return jsonify(feedbacks_por_quarto)

@app.route('/adicionar_feedback', methods=['POST'])
def adicionar_feedback():
    data = request.json
    quarto = data.get('quarto')
    feedback = data.get('texto')

    # Calcula o star rating usando análise de sentimentos
    estrelas = calcular_star_rating(feedback)

    # Insere o feedback e o rating no banco
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute("INSERT INTO feedbacks (quarto, feedback) VALUES (?, ?)",
                   (quarto, feedback))
    conn.commit()
    conn.close()

    # Retorna o rating para o frontend
    return jsonify({'estrelas': estrelas})


@app.route('/atualizar_estrelas_media', methods=['POST'])
def atualizar_estrelas_media():
    data = request.json
    quarto = data.get('quarto')
    estrelas_media = data.get('estrelas_media')

    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute("INSERT OR REPLACE INTO quartos (quarto, estrelas_media) VALUES (?, ?)", (quarto, estrelas_media))
    conn.commit()
    conn.close()

    return jsonify({'status': 'Estrelas médias atualizadas com sucesso'})


if __name__ == '__main__':
    app.run(debug=True)
