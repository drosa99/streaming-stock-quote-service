Executar stream
---
curl "http://localhost:8080/quotes" -i -H "Accept: application/x-ndjson"

Executar buscar primeiros 10 da stream
---
curl "http://localhost:8080/quotes" -i -H "Accept: application/json"