CREATE TABLE customer (
    customer_id serial NOT NULL,
    store_id integer NOT NULL,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    email varchar(50),
    address_id integer NOT NULL,
    activebool boolean DEFAULT true NOT NULL,
    active integer,
    CONSTRAINT pk_customer_customer_id PRIMARY KEY (customer_id)
);

CREATE TABLE actor (
    actor_id serial NOT NULL,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    CONSTRAINT pk_actor_actor_id PRIMARY KEY (actor_id)
);
    
CREATE TABLE category (
    category_id serial NOT NULL,
    name varchar(25) NOT NULL,
    CONSTRAINT pk_category_category_id PRIMARY KEY (category_id)
);

CREATE TABLE film (
    film_id serial NOT NULL,
    title varchar(255) NOT NULL,
    description varchar(512),
    release_year smallint,
    language_id integer NOT NULL,
    original_language_id integer,
    rental_duration smallint DEFAULT 3 NOT NULL,
    rental_rate numeric(4,2) DEFAULT 4.99 NOT NULL,
    length smallint,
    replacement_cost numeric(5,2) DEFAULT 19.99 NOT NULL,
    rating varchar(5) DEFAULT 'G',
    CONSTRAINT pk_film_film_id PRIMARY KEY (film_id),
    CONSTRAINT ck_film_rating CHECK (rating IN ('G', 'PG', 'PG-13', 'R', 'NC-17'))
);

CREATE TABLE film_actor (
    actor_id integer NOT NULL,
    film_id integer NOT NULL,
    CONSTRAINT pk_film_actor_actor_id_film_id PRIMARY KEY (actor_id, film_id)
);

CREATE TABLE film_category (
    film_id integer NOT NULL,
    category_id integer NOT NULL,
    CONSTRAINT pk_film_category_film_id_category_id PRIMARY KEY (film_id, category_id)
);

CREATE TABLE address (
    address_id serial NOT NULL,
    address varchar(50) NOT NULL,
    address2 varchar(50),
    district varchar(20) NOT NULL,
    city_id integer NOT NULL,
    postal_code varchar(10),
    phone varchar(20) NOT NULL,
    CONSTRAINT pk_address_address_id PRIMARY KEY (address_id)
);

CREATE TABLE city (
    city_id serial NOT NULL,
    city varchar(50) NOT NULL,
    country_id integer NOT NULL,
    CONSTRAINT pk_city_city_id PRIMARY KEY (city_id)
);

CREATE TABLE country (
    country_id serial NOT NULL,
    country varchar(50) NOT NULL,
    CONSTRAINT pk_country_country_id PRIMARY KEY (country_id)
);
    
CREATE TABLE inventory (
    inventory_id serial NOT NULL,
    film_id integer NOT NULL,
    store_id integer NOT NULL,
    CONSTRAINT pk_inventory_inventory_id PRIMARY KEY (inventory_id)
);
    
CREATE TABLE language (
    language_id serial NOT NULL,
    name character(20) NOT NULL,
    CONSTRAINT pk_language_language_id PRIMARY KEY (language_id)
);

CREATE TABLE payment (
    payment_id serial NOT NULL,
    customer_id integer NOT NULL,
    staff_id integer NOT NULL,
    rental_id integer NOT NULL,
    amount numeric(5,2) NOT NULL,
    payment_date timestamp without time zone NOT NULL,
    CONSTRAINT pk_payment_payment_id PRIMARY KEY (payment_id)
);
    
CREATE TABLE rental (
    rental_id serial NOT NULL,
    rental_date timestamp without time zone NOT NULL,
    inventory_id integer NOT NULL,
    customer_id integer NOT NULL,
    return_date timestamp without time zone,
    staff_id integer NOT NULL,
    CONSTRAINT pk_rental_id PRIMARY KEY (rental_id)
);
    
CREATE TABLE staff (
    staff_id serial NOT NULL,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) NOT NULL,
    address_id integer NOT NULL,
    email varchar(50),
    store_id integer NOT NULL,
    active boolean DEFAULT true NOT NULL,
    username varchar(16) NOT NULL,
    password varchar(40),
    CONSTRAINT pk_staff_staff_id PRIMARY KEY (staff_id)
);

CREATE TABLE store (
    store_id serial NOT NULL,
    manager_staff_id integer NOT NULL,
    address_id integer NOT NULL,
    CONSTRAINT pk_store_store_id PRIMARY KEY (store_id)
); 

ALTER TABLE film
ADD FOREIGN KEY(language_id)
REFERENCES language(language_id);   

ALTER TABLE film
ADD FOREIGN KEY(original_language_id)
REFERENCES language(language_id);   

ALTER TABLE film_actor
ADD FOREIGN KEY(film_id)
REFERENCES film(film_id);

ALTER TABLE film_actor
ADD FOREIGN KEY(actor_id)
REFERENCES actor(actor_id);   

ALTER TABLE film_category
ADD FOREIGN KEY(category_id)
REFERENCES category(category_id);

ALTER TABLE film_category
ADD FOREIGN KEY(film_id)
REFERENCES film(film_id);

ALTER TABLE inventory
ADD FOREIGN KEY(film_id)
REFERENCES film(film_id);

ALTER TABLE inventory
ADD FOREIGN KEY(store_id)
REFERENCES store(store_id);

ALTER TABLE customer
ADD FOREIGN KEY(store_id)
REFERENCES store(store_id);

ALTER TABLE customer
ADD FOREIGN KEY(address_id)
REFERENCES address(address_id);

ALTER TABLE rental
ADD FOREIGN KEY(inventory_id)
REFERENCES inventory(inventory_id);

ALTER TABLE rental
ADD FOREIGN KEY(customer_id)
REFERENCES customer(customer_id);

ALTER TABLE rental
ADD FOREIGN KEY(staff_id)
REFERENCES staff(staff_id);

ALTER TABLE store
ADD FOREIGN KEY(manager_staff_id)
REFERENCES staff(staff_id);

ALTER TABLE store
ADD FOREIGN KEY(address_id)
REFERENCES address(address_id);

ALTER TABLE staff
ADD FOREIGN KEY(address_id)
REFERENCES address(address_id);

ALTER TABLE staff
ADD FOREIGN KEY(store_id)
REFERENCES store(store_id);

ALTER TABLE payment
ADD FOREIGN KEY(customer_id)
REFERENCES customer(customer_id);

ALTER TABLE payment
ADD FOREIGN KEY(staff_id)
REFERENCES staff(staff_id);

ALTER TABLE payment
ADD FOREIGN KEY(rental_id)
REFERENCES rental(rental_id);

ALTER TABLE address
ADD FOREIGN KEY(city_id)
REFERENCES city(city_id);

ALTER TABLE city
ADD FOREIGN KEY(country_id)
REFERENCES country(country_id);
