drop table if exists videojuego;

create table videojuego(
ID int primary key auto_increment,
NOMBRE varchar(200) not null,
DESCRIPCION varchar(3000),
IMAGEN_URL varchar(500)
);
insert into videojuego
(NOMBRE, DESCRIPCION, IMAGEN_URL)
VALUES
('Monster Hunter', ' Monster Hunter: World es un videojuego de rol y acción, ambientado en un entorno de mundo abierto, y jugado desde una perspectiva en tercera persona. ... ​ El personaje del jugador no tiene ningún atributo intrínseco, sino que está determinado por el equipo con el que está equipado el personaje.', 'https://store-images.s-microsoft.com/image/apps.23351.64828036868441790.79978c50-d657-45e2-9dd7-f132b22f3122.3ce2b04c-f38a-4e9d-aab9-b1a2812c0e33'),
('Spider-Man (Ps4)', 'Spider-Man para PS4 es un videojuego de acción y aventuras con un estilo jugable de mundo abierto, que permite al jugador desplazarse de un lugar a otro con total libertad de movimientos y que tiene por escenario donde de desarrolla la historia, la ciudad de Nueva York.', 'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e9c13725-c5c3-49f8-be82-92147e347045/dcya5nm-04a41370-556e-438b-a222-d6f805d13a24.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvZTljMTM3MjUtYzVjMy00OWY4LWJlODItOTIxNDdlMzQ3MDQ1XC9kY3lhNW5tLTA0YTQxMzcwLTU1NmUtNDM4Yi1hMjIyLWQ2ZjgwNWQxM2EyNC5qcGcifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.iTPUgxG4Oj0sSuY1MKDAGcTEUfQlQ3UrhFzsBSCYBZo')
('Tekken 7', 'Tekken 7: Fated Retribuition es un videojuego desarrollado y producido por Bandai Namco, para las consolas PS4, Xbox One y PC. El nuevo título de la reconocida saga de lucha nos llegará con unos gráficos solo posibles gracias al motor Unreal Engine 4 e incluirá nuevos personajes como Claudio y Katarina.', 'https://s1.gaming-cdn.com/images/products/1515/orig/tekken-7-cover.jpg')
('Metin2', 'Metin2 es un MMORPG de acción en tiempo real, desarrollado por Ymir Entertainment y lanzado en Corea del Sur en 2004. Desde entonces ha sido distribuido en muchos países europeos, México, España y EUA por Gameforge 4D GmbH y en Singapur por TEC Interactive Pte. El juego es gratuito en todas sus versiones.', 'http://playingdaily.pl/wp-content/uploads/2014/01/metin2-cover.jpg');