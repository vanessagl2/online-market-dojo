## 1. Create a Product 

<i>
As a manager for OnlineMarket<br>
I want to create my selection of products<br>
So that I can offer them to my customers<br>
</i>
<br>

The requirement is that you build an OnlineMarket API that offers the possibility for an admin consumer to create products that will be offered by your API. 

<br>After a product is created on the OnlineMarket database, **your database must create an unique ID** for that Product.

### Technical Requirement
* HTTP Method: POST
* URL: /products
* Payload accepted
```
{
  "name": {
    "fullName": "string",
    "displayName": "string"
  },
  "price": 
    {
      "amount": "string",
      "currency": "string"
    }
}
```

### Error Handling
* name.fullName -> required
* name.displayName -> optional
    * If displayName is not provided it should be stored as empty 
* price -> required

Your API should be prepared to either receive or not any optional fields from your payload.


## 2. Create online documentation 
Your API will serve many customers. Provide an online documentation using Swagger.

Reference: https://swagger.io/

## 3. Retrieve existing products 

<i>
As a manager for OnlineMarket<br>
I want to see my selection of products<br>
So that I know what my market is offering to customers<br>
</i>
<br>

The requirement is that you build an OnlineMarket API that offers the possibility for a consumer 
to get products that are offered by your API.

<br> This means that any products created on the application should be returned as part of a new endpoint.

### Technical Requirement
* HTTP Method: GET
* URL: /products
* Payload returned
```
{
    "data": {
        "products": [
            {
                "id": "string",
                "name": {
                    "fullName": "string",
                    "displayName": "string"
                },
                "price": {
                    "amount": "string",
                    "currency": "string"
                }
            },
            {
                "id": "string",
                "name": {
                    "fullName": "string",
                    "displayName": "string"
                },
                "price": {
                    "amount": "string",
                    "currency": "string"
                }
            }
        ]
    }
}
```
