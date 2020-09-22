select * from sakila.film_category;
select * from sakila.category;
select * from sakila.film;

create table sakila.film_genre as (
select film.film_id, film.title, film_category.category_id, category.name from
sakila.film inner join sakila.film_category on film.film_id = film_category.film_id
inner join sakila.category on film_category.category_id = category.category_id
);

select * from sakila.film_genre;