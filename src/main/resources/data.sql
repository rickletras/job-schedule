INSERT INTO SCHEDULE_JOBS (name) VALUES 
    ('Schedule 1'),
    ('Schedule 2'),
    ('Schedule 3');

INSERT INTO JOB ( DESCRIPTION, DATE_MAX_FINISH, TIME_ESTIPULATE, SCHEDULE_ID) VALUES 
    ('Importação de arquivos de fundos',  {ts '2019-11-10 12:00:00'}, 2.0, 1),
    ('Importação de dados da Base Legada',  {ts '2019-11-11 12:00:00'}, 4.0, 2),
    ('Importação de dados de integração',  {ts '2019-11-11 08:00:00'}, 6.0, 3);
