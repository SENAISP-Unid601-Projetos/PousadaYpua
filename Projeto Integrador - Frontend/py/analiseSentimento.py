from textblob import TextBlob
from googletrans import Translator

# Inicializa o tradutor do Google
translator = Translator()

def traduzir_para_ingles(texto):
    traducao = translator.translate(texto, src='pt', dest='en')
    return traducao.text

def calcular_star_rating(feedback):
    feedback_em_ingles = traduzir_para_ingles(feedback)
    
    # Análise de sentimentos usando TextBlob
    pontuacoes = TextBlob(feedback_em_ingles).sentiment
    polaridade = pontuacoes.polarity  # Valor de polaridade entre -1 e 1
    
    # Novos limites
    if polaridade >= 0.6:
        return 5
    elif polaridade >= 0.3:
        return 4
    elif polaridade >= 0.0:
        return 3
    elif polaridade >= -0.3:
        return 2
    else:
        return 1
