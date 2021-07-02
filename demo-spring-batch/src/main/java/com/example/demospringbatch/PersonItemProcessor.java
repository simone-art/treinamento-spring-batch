package com.example.demospringbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    //Variável que permite escrever na consola
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        //Os valores das variáveis vao ser transformadas em maiúsculas
        // pra ver as mudanças dos objetos

        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Convertendo (" + person + ") em (" + transformedPerson + ")");

        return transformedPerson;
    }

}
