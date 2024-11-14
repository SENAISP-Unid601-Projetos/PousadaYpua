const feedbacks = {
    'quarto 1': [],
    'quarto 2': [],
    'quarto 3': [],
    'quarto 4': [],
    'quarto 5': [],
    'quarto 6': [],
    'quarto 7': [],
    'quarto 8': [],
    'quarto 9': [],
    'quarto 10': [],
};

let quartoAtual = ''; // Variável para armazenar o quarto atual

function carregarFeedbacks() {
    const savedFeedbacks = JSON.parse(localStorage.getItem('feedbacks'));
    if (savedFeedbacks) {
        Object.keys(savedFeedbacks).forEach(quarto => {
            feedbacks[quarto] = savedFeedbacks[quarto];
            atualizarEstrelas(quarto);  // Atualiza as estrelas ao carregar
        });
    }
}

function salvarFeedbacks() {
    localStorage.setItem('feedbacks', JSON.stringify(feedbacks));
}


function atualizarEstrelas(quartoNome) {
    const starRatingElement = document.getElementById(`starRating${quartoNome.split(' ')[1]}`);
    let totalEstrelas = 0;
    let numeroFeedbacks = feedbacks[quartoNome].length;

    feedbacks[quartoNome].forEach(feedback => {
        totalEstrelas += feedback.estrelas;
    });

    const estrelasMedia = numeroFeedbacks > 0 ? Math.round(totalEstrelas / numeroFeedbacks) : 0;
    starRatingElement.innerHTML = '★'.repeat(estrelasMedia) + '☆'.repeat(5 - estrelasMedia);
}

// Exibe feedbacks do quarto selecionado
function verFeedbacks(quartoNome) {
    quartoAtual = quartoNome; // Atualiza o quarto atual
    const feedbackContainer = document.getElementById("mostrarFeedback");
    feedbackContainer.innerHTML = '';

    const modalQuartoNome = document.getElementById("modalQuartoNome");
    modalQuartoNome.innerHTML = `<h5>${quartoNome.charAt(0).toUpperCase() + quartoNome.slice(1)}</h5>`;

    // Atualiza a lista de feedbacks
    let totalEstrelas = 0;
    let numeroFeedbacks = 0;

    feedbacks[quartoNome].forEach(({ texto, estrelas }) => {
        const li = document.createElement('li');
        li.className = 'list-group-item';
        li.innerText = texto;
        feedbackContainer.appendChild(li);
        
        // Atualiza total de estrelas e número de feedbacks
        totalEstrelas += estrelas;
        numeroFeedbacks++;
    });

    // Atualiza a classificação das estrelas no modal
    const modalStarRating = document.getElementById("modalStarRating");
    const estrelasMedia = numeroFeedbacks > 0 ? Math.round(totalEstrelas / numeroFeedbacks) : 0;
    modalStarRating.innerHTML = '★'.repeat(estrelasMedia) + '☆'.repeat(5 - estrelasMedia);

    // Atualiza as estrelas na página principal
    atualizarEstrelas(quartoNome);
}

// Adiciona feedback e atualiza as estrelas
function adicionarFeedback(quartoNome, novoFeedback, estrelas) {
    if (novoFeedback) {
        feedbacks[quartoNome].push({ texto: novoFeedback, estrelas: estrelas }); // Armazena o feedback como um objeto
        salvarFeedbacks(); // Salva os feedbacks
        verFeedbacks(quartoNome); // Atualiza a lista de feedbacks
    }
}

// Função para adicionar um novo feedback com análise de sentimentos
function adicionarNovoFeedback() {
    const quartoNome = document.getElementById("modalQuartoNome").innerText.toLowerCase();
    const novoFeedback = document.getElementById("novoFeedback").value;

    if (novoFeedback) {
        // Chama a API para analisar o feedback e salvar no banco
        fetch('http://127.0.0.1:5000/adicionar_feedback', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ quarto: quartoNome, texto: novoFeedback })
        })
        .then(response => response.json())
        .then(data => {
            // Exibe a classificação de estrelas retornada
            const estrelas = data.estrelas;
            adicionarFeedback(quartoNome, novoFeedback, estrelas); // Atualiza a interface com a nova avaliação
            atualizarEstrelas(quartoNome); // Atualiza as estrelas na página principal
            document.getElementById("novoFeedback").value = ''; // Limpa o campo de feedback
            atualizarEstrelasMedia(quartoNome);
        })
        .catch(error => console.error('Erro:', error));
    }
}

// Limpa feedbacks do quarto atual
function limparFeedbackPorQuarto() {
    // Limpa os feedbacks do quarto atual
    feedbacks[quartoAtual] = [];
    salvarFeedbacks(); // Salva as alterações no localStorage
    verFeedbacks(quartoAtual); // Atualiza a lista de feedbacks no modal
    atualizarEstrelas(quartoAtual); // Atualiza as estrelas na página principal
}


// Funcao que envia as estrelas atualiada para o banco de dados
function atualizarEstrelasMedia(quartoNome) {
    let totalEstrelas = 0;
    let numeroFeedbacks = feedbacks[quartoNome].length;

    feedbacks[quartoNome].forEach(feedback => {
        totalEstrelas += feedback.estrelas;
    });

    const estrelasMedia = numeroFeedbacks > 0 ? (totalEstrelas / numeroFeedbacks).toFixed(1) : 0;

    // Envia a média de estrelas para o backend
    fetch('http://127.0.0.1:5000/atualizar_estrelas_media', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ quarto: quartoNome, estrelas_media: parseFloat(estrelasMedia) })
    })
    .then(response => response.json())
    .then(data => {
        console.log(`Estrelas médias do ${quartoNome} atualizadas com sucesso.`);
    })
    .catch(error => console.error('Erro ao atualizar estrelas médias:', error));
}


// Inicializa a aplicação
carregarFeedbacks();
