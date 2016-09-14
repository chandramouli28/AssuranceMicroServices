package com.asurance.quotegeneration.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.asurance.quotegeneration.entity.PrimaryDataVO;
import com.asurance.quotegeneration.entity.Quote;


public class DroolsHandler {

	 public static final void main(String[] args) {
	       
		 PrimaryDataVO droolData = new PrimaryDataVO();
	
		 droolData.setAge(24);
		 Quote genQuote = runDroolEngine(droolData);
		 System.out.println(genQuote.getQuoteAmount() + ", " + genQuote.getQuoteId());	       
	    }

	public static Quote runDroolEngine(PrimaryDataVO droolData) {
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
 
		// go !
		kSession.setGlobal("quote", new Quote());
		
		kSession.insert(droolData);
		int fired = kSession.fireAllRules();
		System.out.println(fired);
		Quote quote = (Quote) kSession.getGlobal("quote");
		System.out.println(quote.getQuoteAmount() + quote.getQuoteId());
		kSession.dispose();
		
		return quote;
	}
	
}
