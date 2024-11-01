from vaderSentiment.vaderSentiment import SentimentIntensityAnalyzer
from googletrans import Translator

# Inicializa o tradutor do Google
translator = Translator()

# Inicializa o analisador VADER
analyzer = SentimentIntensityAnalyzer()


def traduzir_para_ingles(texto):
    traducao = translator.translate(texto, src='pt', dest='en')
    return traducao.text

def calcular_star_rating(feedback):
    # Traduz o feedback para inglês
    feedback_em_ingles = traduzir_para_ingles(feedback)
    
    # Obtém os resultados da análise de sentimentos
    pontuacoes = analyzer.polarity_scores(feedback_em_ingles)
    
    # Determina a classificação por estrelas com base nas pontuações
    if pontuacoes['compound'] >= 0.6:
        return 5
    elif pontuacoes['compound'] >= 0.3:
        return 4
    elif pontuacoes['compound'] >= 0.1:
        return 3
    elif pontuacoes['compound'] >= -0.1:
        return 2
    else:
        return 1
