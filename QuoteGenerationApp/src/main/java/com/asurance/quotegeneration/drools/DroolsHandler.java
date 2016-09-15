package com.asurance.quotegeneration.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.asurance.quotegeneration.entity.PrimaryDataVO;
import com.asurance.quotegeneration.entity.Quote;

@Service ("droolsHandler")
public class DroolsHandler {

	 /*public static final void main(String[] args) {
	       
		 PrimaryDataVO droolData = new PrimaryDataVO();
	
		 droolData.setAge(24);
		 droolData.setClaimOnVehicle(2000.0);
		 droolData.setPoints(3);
		 droolData.setNumOfClaimsOnVehicle(2);;
		 Quote genQuote = runDroolEngine(droolData);
		 System.out.println(genQuote.getQuoteAmount() + ", " + genQuote.getQuoteId());	       
	    }*/

	public Quote runDroolEngine(PrimaryDataVO droolData) {
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
 
		// go !
		kSession.setGlobal("quote", new Quote());
		
		kSession.insert(droolData);
		int fired = kSession.fireAllRules();
		System.out.println(fired + " num of rules hit");
		Quote quote = (Quote) kSession.getGlobal("quote");
		System.out.println(quote.getQuoteAmount() + quote.getQuoteId());
		kSession.dispose();
		
		return quote;
	}
	
}
