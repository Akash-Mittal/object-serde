# object-serde

###### Serializing and Deserializing referred to as SerDe
##### The Following POC try to 
* Find the best Practice When Serializing and Deserializing a Business Object 
* Find How to Parse a Complex Object from and To Json (SerDe - Serialization and De serialization)effectively.

### A typical Object would have

* Multiple Objects (Composition).
* Has Collections of Object typically a 
	* Map/List.
	* Array
* Has A or Is a Generic Object Implementation.
* Date Object.


### Sample 

		{
		  "headers": {
		    "8tgeaIBUV_": "pyXvslfNVJ",
		    "x1KLmYZiQy": "5EKqz1HLEF",
		    "ZQUWiivhbC": "RskiCCnLs8",
		    "da_KW3ICJF": "mmHPdQ6RjO",
		    "wETVGZ3PoI": "JVDm6tJJ2D"
		  },
		  "body": {
		    "type": "WISHLIST",
		    "date": {
		      "year": 2019,
		      "month": 9,
		      "day": 17
		    },
		    "description": "J8_C_NXZci"
		  }
		}

### Take Aways
* How to Pretty Print a JSON file.
* How to Dynamically Test JSON - without loading it from file system
