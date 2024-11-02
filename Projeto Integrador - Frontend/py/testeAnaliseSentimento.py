from sklearn.metrics import confusion_matrix, accuracy_score, precision_score
from analiseSentimento import calcular_star_rating

# Conjunto de teste com feedbacks e classificações esperadas
feedbacks_test = [
    {"feedback": "Gostei muito do quarto, foi uma ótima experiência!", "expected_rating": 5},
    {"feedback": "O quarto estava ok, nada especial.", "expected_rating": 3},
    {"feedback": "Não gostei do serviço, deixou a desejar.", "expected_rating": 2},
    {"feedback": "Horrível, nunca mais volto.", "expected_rating": 1},
    {"feedback": "Excelente! Tudo perfeito.", "expected_rating": 5},
    {"feedback": "O lugar era bom, mas a limpeza não estava ótima.", "expected_rating": 3},
    {"feedback": "Atendimento excelente!", "expected_rating": 5},
    {"feedback": "Foi uma experiência muito ruim.", "expected_rating": 1}
]

# Calcula as previsões usando o modelo
predicted_ratings = [calcular_star_rating(f['feedback']) for f in feedbacks_test]
expected_ratings = [f['expected_rating'] for f in feedbacks_test]

# Gera a matriz de confusão
conf_matrix = confusion_matrix(expected_ratings, predicted_ratings)

# Calcula acurácia e precisão
accuracy = accuracy_score(expected_ratings, predicted_ratings)
precision = precision_score(expected_ratings, predicted_ratings, average='weighted', zero_division=0)

# Exibe os resultados
print("Matriz de Confusão:")
print(conf_matrix)
print("\nAcurácia:", accuracy)
print("Precisão:", precision)
