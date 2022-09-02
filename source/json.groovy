import groovy.json.JsonBuilder

JsonBuilder builder2  = new JsonBuilder()

builder2.books{
	book {
		title 'Las intermitencias de la muerte'
		isbn '978-1937785307'
		author (first: 'Jose', last: 'Saramago', twitter: '@none')
		related 'El viaje de elefante', 'El Evangelio'
	}	
}

println builder2.toString()