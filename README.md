# ANLY-560
For class ANLY 560-51B

The query used to create the required table is:

create table sakila.film_genre as (
select film.film_id, film.title, film_category.category_id, category.name from
sakila.film inner join sakila.film_category on film.film_id = film_category.film_id
inner join sakila.category on film_category.category_id = category.category_id
);

This query consists of two inner joins between three tables named 'film', 'film_category', and 'category'. The tables 'film' and 'film_category' are joined based on the column 'film_id'. The result is then joined with the table 'category' based on the column 'category_id'. Three tables need to be joined together because the four columns that are required come from these three tables.

Column 'film_id' and 'title' come from the table 'film'. Column 'category_id' comes from the table 'film_category'. Finally, column 'name' comes from the table 'category'. The 'name' column is the genre of the movies that we want to see.
