--references?
--dizeler, tarih değerleri ve cinsiyet gibi tek karakterli değerler için VARCHAR2 kullanılır .DATECHAR(1)

 CREATE TABLE CRM.Customer_Contact_Info (
       id NUMBER PRIMARY KEY,
       customer_id NUMBER NOT NULL,
       contact_type VARCHAR2(50),
       contact_info VARCHAR2(100),
       status VARCHAR2(20),
       create_date DATE DEFAULT SYSDATE,
       create_operation VARCHAR2(50),
       update_date DATE,
       update_operation VARCHAR2(50),


      FOREIGN KEY (customer_id) REFERENCES CRM.CUSTOMERS(customer_id)
   );

   CREATE TABLE CRM.Address_types (
       id NUMBER PRIMARY KEY,
       address_type VARCHAR2(50) NOT NULL,
       create_date DATE DEFAULT SYSDATE,
       update_date DATE ,
       create_operation VARCHAR2(50),
       update_operation VARCHAR2(50)
   );

   CREATE TABLE CRM.Customer_Detail (
       detail_id NUMBER PRIMARY KEY,
       customer_id NUMBER,
       first_name VARCHAR2(50),
       last_name VARCHAR2(50),
       gender varchar2(10),
       birth_date DATE,
       birth_place VARCHAR2(100),
       passport_no VARCHAR2(20),
       create_date DATE DEFAULT SYSDATE,
       update_date DATE,
       create_operation VARCHAR2(50),
       update_operation VARCHAR2(50),

       FOREIGN KEY (customer_id) REFERENCES CRM.CUSTOMERS(customer_id)
   );

   CREATE TABLE CRM.Countries (
       id NUMBER PRIMARY KEY,
       nationality_code VARCHAR2(10) NOT NULL,
       country_code CHAR(3) NOT NULL,
       create_date DATE DEFAULT SYSDATE,
       update_date DATE ,
       create_operation VARCHAR2(50),
       update_operation VARCHAR2(50)
   );
   CREATE TABLE CRM.Customers (
       customer_id NUMBER PRIMARY KEY,
       identity_no VARCHAR2(50) NOT NULL UNIQUE,
       status VARCHAR2(50),
       activation_date DATE,
       deactivation_date DATE,
       nationality_id NUMBER,
       create_date date DEFAULT sysdate,
       update_date date ,
       create_operation VARCHAR2(50),
       update_operation VARCHAR2(50),
       FOREIGN KEY (nationality_id) REFERENCES CRM.COUNTRIES (id)

   );

   CREATE TABLE CRM.customer_address (
       customer_address_id NUMBER  PRIMARY KEY,
       customer_id NUMBER NOT NULL,
       status VARCHAR2(50) NOT NULL,
       address_type_id NUMBER NOT NULL,
       address_info VARCHAR2(255) NOT NULL,
       post_code VARCHAR2(20),
       city_code VARCHAR2(20),
       country_code NUMBER NOT NULL,
       create_date  DATE DEFAULT SYSDATE,
       update_date DATE,
       create_operation VARCHAR2(50),
       update_operation VARCHAR2(50),
       FOREIGN KEY (customer_id) REFERENCES CRM.CUSTOMERS(CUSTOMER_ID),
       FOREIGN KEY (address_type_id) REFERENCES CRM.ADDRESS_TYPES (id),
       FOREIGN KEY (country_code) REFERENCES CRM.COUNTRIES(ID)
      );