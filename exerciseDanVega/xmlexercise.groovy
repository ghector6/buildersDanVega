import groovy.xml.MarkupBuilder

MarkupBuilder builder1 = new MarkupBuilder()

builder1.books{
	book(isbn: 9781935182443){
		title "Groovy in Action 2nd Edition"
		author "Dierk Koenig"
		price "50.58"
	}
	book(isbn:978-1935182948){
		title "Making Java Groovy"
		author "Ken Kousen"
		price "33.96"
	}
	book(isbn:978-1937785307){
		title "Programming Groovy 2: Dynamic Productivity for the Java Developer"
		auhtor "Venkat Subramaniam"
		price "28.92"
	}

}