package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
//import static org.assertj.core.api.Assertions.assertThat;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import org.example.app.Calculator;
import org.example.model.Address;
import org.example.model.AddressStatus;
import org.example.model.Channel;
import org.example.model.Subscriber;
import org.example.services.SubscriberService;
import org.junit.Assert;

import java.io.IOException;

public class MathsStepDefinitions {

    private Subscriber subscriber;

    int operatorId;

    @Given("un abonné avec une adresse principale {word} en France")
    public void subscriberMainAddr(String word) throws IOException {
        this.subscriber = SubscriberService.getRandSubscriber(word);
    }

    @When("le conseiller connecté a {word} modifie l'adresse de l'abonné")
    public void conseillerModifAdr(String word) {
        this.operatorId = 3;
        Address oldMainAddr = subscriber.getMainAddress();
        Address newAddress = new Address();
        newAddress.setAddrId(oldMainAddr.getAddrId());
        newAddress.setCity("PARIS");
        newAddress = SubscriberService.modifAddr(operatorId, newAddress);
    }

    @Then("l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné")
    public void addrModified() {
        // TODO: Retrieve the new subscriber data
        Address mainAddr = subscriber.getMainAddress();

        if (mainAddr.getAddressStatus() == AddressStatus.INACTIVE) {
            Assert.assertEquals(0, 1);
        } else {
            Assert.assertEquals(1, 1);
        }
    }

    @Then("un mouvement de modification d'adresse est créé")
    public void movAddrModifCreated() {
        // TODO: Retrieve the movement data
        Address mainAddr = subscriber.getMainAddress();

        if (mainAddr.getAddressStatus() == AddressStatus.INACTIVE) {
            Assert.assertEquals(0, 1);
        } else {
            Assert.assertEquals(1, 1);
        }
    }

}
