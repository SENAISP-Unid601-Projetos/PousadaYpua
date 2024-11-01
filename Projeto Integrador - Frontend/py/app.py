from flask import Flask, request, jsonify
from flask_cors import CORS
from analiseSentimento import calcular_star_rating  # Corrija o caminho conforme necessário


app = Flask(__name__)
CORS(app)  # Permite CORS para todas as rotas do app

@app.route('/analisar_feedback', methods=['POST'])
def analisar_feedback():
    data = request.json
    feedback = data.get('feedback', '')
    
    # Análise de sentimentos
    estrelas = calcular_star_rating(feedback)  # Usando a função correta

    return jsonify({'estrelas': estrelas})

if __name__ == '__main__':
    app.run(debug=True)
