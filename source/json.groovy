import groovy.json.JsonBuilder

JsonBuilder builder2  = new JsonBuilder()

builder2.books{
	currentBook {
		title 'Las intermitencias de la muerte'
		isbn '978-1937785307'
		author (first: 'Jose', last: 'Saramago', twitter: '@none')
		related 'El viaje de elefante', 'El Evangelio'
	}
	nextBook{
		title 'Coraline'
		isbn '978-1937948375'
		author (first:'Neil', last: 'Gaiman', twitter:'@neilhimself')
		related 'American Gods', 'Sandaman'
	}	
}

println builder2.toString()
println builder2.toPrettyString()

new File('json/books.json').write(builder2.toPrettyString())