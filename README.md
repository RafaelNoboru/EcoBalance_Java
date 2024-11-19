# EcoBalance

API do projeto EcoBalance - Software para monitoramento de energia de painéis solares

# Representantes 

- Gabriel Ortiz Oliva Gil - RM: 98642 – 2TDSPK
- Rafael Noboru Watanabe Nasaha - RM:99948 – 2TDSPK
- João Pedro Kraide Máximo - RM:550974 – 2TDSPK
- Matheus de Andrade Ferreira - RM:99375 – 2TDSPK
- Larissa Pereira Biusse - RM:551062 - 2TDSPK

# Como rodar a aplicação

- Iniicialize a aplicação com o VS Code Studio ou IntelliJ
- Para testar os endpoints apenas no backend, utilize um programa como o Postman ou o Insomnia
- Inicie o arquivo "docker-compose" para criar e conectar o banco de dados
- Inicie a aplicação e acesse o endereço HTTP "localhost:8080"

# Objetivos da aplicação

- O usuário pode visualizar o consumo e produção atual através da conexão com o ThinerIO e um dispositivo ESP32
- O usuário também pode consultar um histórico com consumos e produções de outros dias e horários
- O usuário também pode consultar a OpenAI para um chat
- O administrador da API poderá enviar emails para usuários contendo recomendações com relação ao seu consumo e produção de energia

- Link do video pitch: https://youtu.be/HGnGGCAWsMQ
- Link do video explicando: https://youtu.be/kGw506bi20A?si=D7KMnR-B1Mrqwczp

# Recursos da aplicação

- CRUD com banco de dados PostGre
- Autenticação e criptografia de senhas
- Serviço de Mensageria (RabbitMQ) para envio de emails
- Integração de um chat com inteligência artificial (OpenAI)
- Login com conta do Google através do OAuth2
- Instalação de banco de dados por Docker, viabilizando o uso em qualquer máquina
- Templates utilizando thymeleaf
- Conexão com API externa (ThingerIO)
- Distinção de papéis entre Administrador e Usuário




