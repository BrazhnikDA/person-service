CREATE VIEW view_illness_medical_card AS
SELECT address.contact_id, address.city, address.index, contact.id, contact.phone_number, contact.email
FROM address
    JOIN
     contact ON address.contact_id = contact.id;