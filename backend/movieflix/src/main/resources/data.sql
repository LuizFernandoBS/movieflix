INSERT INTO tb_user (name, email, password) VALUES ('Luiz Fernando', 'lufernandobs@gmail.com', '1234');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Marta', 'mmarta@gmail.com', '1234');

INSERT INTO tb_role (authority) VALUES ('VISITOR');
INSERT INTO tb_role (authority) VALUES ('MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1L, 1L);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2L, 1L);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2L, 2L);

INSERT INTO tb_genre(name) VALUES ('Epic');
INSERT INTO tb_genre(name) VALUES ('Action');
INSERT INTO tb_genre(name) VALUES ('Horror');

INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Lord of the Rings', 2000, 'Return of the King', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Lord of the Rings Movie', 1L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Silmarillion', 2001, '1', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Lord of the Rings Movie', 1L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('The Hobbit', 2002, '1', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Lord of the Rings Movie', 1L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Terminator 1', 1985, 'First Chapter', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Enemy', 2L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Terminator 2', 1986, 'Second Chapter', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Enemy', 2L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Terminator 3', 1987, 'Third Chapter', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Enemy', 2L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Matrix', 1999, 'Realoaded', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Machine', 3L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Matrix 2', 1999, 'Invencible', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Machine', 3L);
INSERT INTO tb_movie (title, year, subtitle, img_Url, synopsis, genre_id) VALUES ('Matrix 3', 1999, 'Final Countdown', 'https://www.google.com/url?q=https://produto.mercadolivre.com.br/MLB-3482427167-the-lord-of-the-rings-the-return-of-the-king-para-play-2-_JM%3Fmatt_tool%3D18956390%26utm_source%3Dgoogle_shopping%26utm_medium%3Dorganic&opi=95576897&sa=U&ved=0ahUKEwjm-a6Z2fKFAxXGrZUCHbBUDd0QrzwIGw&usg=AOvVaw0JSdcJIhD0ylzHaToTtRLA', 'A new Machine', 3L);

INSERT INTO tb_review (text, user_id, movie_id) VALUES ('Wonderful movie', 1L, 1L);
INSERT INTO tb_review (text, user_id, movie_id) VALUES ('I love this movie', 1L, 2L);
INSERT INTO tb_review (text, user_id, movie_id) VALUES ('This is a classic', 2L, 1L);
INSERT INTO tb_review (text, user_id, movie_id) VALUES ('A need to watch it in the cinema', 2L, 2L);
INSERT INTO tb_review (text, user_id, movie_id) VALUES ('I love this movie', 2L, 3L);