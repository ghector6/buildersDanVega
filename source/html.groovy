import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.html{
	head{
		title 'Aboout Hector Garcia'
		description 'This is part of my Diaspora journal '
		keywords 'Hector, Groovy, Java, Spring'
	}
}