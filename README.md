# SpringBootSimpleRestApi
---
#SpringBoot #REST #Lombok #JPA #H2
---
Prosty mikroserwis umożliwiający zapisanie informacji (name) w bazie danych oraz odczytanie listy zapisanych rekordów.
Mikroserwis zbudowany na SpringBoot, wykorzystuje bazę danych H2 (inmemo), JPA (Hibernate) oraz bibliotekę Lombok.
Po przesłaniu danych (name), do użytkownika zwracany jest rekord z bazy danych (id+name).
Serwis zabezpieczony jest przed wpisaniem pustych informacji. Dane walidowane są na etapie odczytu (Valid NotEmpty), dodatkowo kolumna przechowująca wiadomość zdefiniowana jest jako NotNull.
W przypadku próby zapisania pustej informacji do użytkownika przesyłany jest komunikat z błędem - dane nie zostają zapisane w bazie.
Mikroserwis akceptuje dane w formacie Json.

Dostępne żądania:

http://localhost:8080/list (GET) - wyświetla listę danych (JSON)

http://localhost:8080/add (POST) - zapisuje dane do bazy (JSON)

Przykład treści zapytania /add (POST):
{
"name":"Piotr"
}

----------
Simple microservice that allows to save information (name) in database and list previously saved data.
Microservice is build on SpringBoot, uses H2 database(inmemo), JPA (Hibernate) and Lombok library.
After sending data (name) the record from the db (id+name) is returned to the user.
Service is protected from null-data. Data is validated at the reading stage(Valid NotEmpty), in addition column storing the message is defined as NotNull.
If you try to save empty information, an error message is sent to the user - data is not saved in db.
Microservice accept Json format data.

Available requests:

http://localhost:8080/list (GET) - list date from db (JSON)

http://localhost:8080/add (POST) - saves data to db (JSON)

Sample body of request /add (POST):
{
"name":"Piotr"
}
