### Create product

```
curl --location 'http://localhost:8080/products' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Item 01",
    "price": 12.3,
    "quantity": 10
}'
```