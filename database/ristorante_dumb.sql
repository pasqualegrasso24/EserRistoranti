INSERT INTO Ristorante(nome, indirizzo,telefono) VALUES
						('Incontro', 'Avellino', '339201'),
						('Hotel Kristall', 'Napoli', '339202'),
                        ('Villa Regina', 'Caserta', '339203'),
                        ('Pignata', 'Ariano Irpino', '339200'),
						('Biffi', 'Benevento', '339200');


INSERT INTO Menu(descrizione, prezzo, idRistorante) VALUES
				('Montagna completo', 35, 1 ),
				('Mare', 40, 1 ),
                ('Montagna', 20, 1 ),
                ('Mare', 25, 2 ),
                ('Montagna', 45, 3 ),
                ('Montagna', 35, 4 ),
				('Mare', 40, 4),
                ('Montagna', 20, 5 ),
                ('Mare', 25, 5);
				
                
INSERT INTO Piatto(descrizione,tipo,portata,idMenu) VALUES			           
             ('Antipasto della casa monti','Antipasto','Antipasto',1),
             ('Cannelloni','Pasta','Primo',1),
             ('Lasagne','Pasta','Primo',2),
             ('Antipasto Mare','Antipasto','Antipasto',2),
             ('Arrosto misto','Carne','Secondo',2),
             ('Zuppa di pesce','Pesce','Secondo',2);
INSERT INTO Users(username,password,privilegi) VALUES
			('p','p','u'); 
            
update  Users set privilegi='u' where username='pasquale';
 
DELETE From Menu WHERE idMenu BETWEEN 15 AND 18;           
             
Select *
FROM Users; 

Select *
FROM Ristorante;            

Select *
FROM Menu;

Select *
FROM Piatto;

Select *
FROM Piatto
where idMenu=1;

Select *
FROM Ristorante as R
INNER JOIN Menu as M on R.idRistorante=M.idRistorante;

Select *
FROM Menu as M
INNER JOIN Piatto as P on M.idMenu=P.idMenu order by portata;

Select *
FROM Piatto 
order by portata;

Select *
FROM Ristorante as R
INNER JOIN Menu as M on R.idRistorante=M.idRistorante 
WHERE R.nome='incontro';

Select *
FROM Ristorante as R
INNER JOIN Menu as M on R.idRistorante=M.idRistorante
INNER JOIN Piatto as P on M.idMenu=P.idMenu 
WHERE R.nome='incontro' and P.portata='primo';

Select *
FROM Ristorante as R
INNER JOIN Menu as M on R.idRistorante=M.idRistorante
INNER JOIN Piatto as P on M.idMenu=P.idMenu;

Select *
FROM Ristorante as R
INNER JOIN Menu as M on R.idRistorante=M.idRistorante



