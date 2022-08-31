import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.html{
	head{
		title 'Aboout Hector Garcia'
		description 'This is part of my Diaspora journal '
		keywords 'Hector, Groovy, Java, Spring'
	}
	body {
		h1 'About Me'
		p 'This is bunch of text about the Groovy journy'
		section{
			h2 'Courses'
			table{
				tr{
					th 'id'
					th 'name'
				}
				tr{
					td '1'
					td 'Groovy'
				}
				tr{
					td '2'
					td 'HUGO'
				}
			}
		}
	}

}