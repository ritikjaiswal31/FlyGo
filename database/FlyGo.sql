-- ============================================================
-- FlyGo - Database Queries  (FlyGo database schema)
-- ============================================================

-- Create and select database
CREATE DATABASE flygo;
USE flygo;

-- Insert roles
INSERT INTO roles(name) VALUES ('ADMIN');
INSERT INTO roles(name) VALUES ('CUSTOMER');
INSERT INTO roles(name) VALUES ('PILOT');

-- Assign roles
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1); -- ADMIN
INSERT INTO users_roles (user_id, role_id) VALUES (1, 2); -- CUSTOMER
INSERT INTO users_roles (user_id, role_id) VALUES (1, 3); -- PILOT

-- ============================================================
-- Implementation Queries
-- ============================================================
-- 1. Airports
SELECT
    id AS airport_id,
    name AS airport_name,
    iata_code,
    city,
    country
FROM airports
ORDER BY id;


-- 2. Flights with route and status
SELECT
    f.flight_number,
    departure.iata_code AS departure,
    arrival.iata_code AS arrival,
    f.departure_time,
    f.arrival_time,
    f.base_price,
    f.status
FROM flights f
JOIN airports departure
    ON f.departure_airport_id = departure.id
JOIN airports arrival
    ON f.arrival_airport_id = arrival.id
ORDER BY f.departure_time;

-- 3. Bookings
SELECT
    b.booking_reference,
    f.flight_number,
    departure.iata_code AS departure,
    arrival.iata_code AS arrival,
    b.booking_date,
    b.status AS booking_status
FROM bookings b
JOIN flights f
    ON b.flight_id = f.id
JOIN airports departure
    ON f.departure_airport_id = departure.id
JOIN airports arrival
    ON f.arrival_airport_id = arrival.id
ORDER BY b.id DESC;

-- 4. Passenger-booking relationship
-- Sensitive information is excluded.
SELECT
    b.booking_reference,
    f.flight_number,
    p.first_name,
    p.last_name,
    p.type AS passenger_type,
    p.seat_number,
    p.special_requests,
    b.status AS booking_status
FROM passengers p
JOIN bookings b
    ON p.booking_id = b.id
JOIN flights f
    ON b.flight_id = f.id
ORDER BY b.id DESC;

-- 5. User roles
SELECT
    id AS role_id,
    name AS role_name
FROM roles
ORDER BY id;