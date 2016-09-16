package com.assurance.quotegeneration.drools;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assurance.quotegeneration.model.CustomerVO;
import com.assurance.quotegeneration.model.Quote;
import com.assurance.quotegeneration.utils.DroolsEngineUtil;


/**
 * DroolsEngineHandler configures and runs assuranceRules.drl in JBOSS drool engine
 * @author Srinivas Kondapaneni
 *
 */
@Service ("droolsEngineHandler")
public class DroolsEngineHandler {
	
	@Autowired
	DroolsEngineUtil droolsEngineUtil;
	
	/**
	 * runDroolEngine method to run drools engine on the set of rules declared in assuranceRules.drl 
	 * with CustomerVO object as input.
	 * @param customerDroolData
	 * @return quote
	 */
	public Quote runDroolEngine(CustomerVO customerDroolData) {
		
		KieSession kSession = droolsEngineUtil.getKieSession();
 
		//Set global
		kSession.setGlobal("quote", new Quote());
		
		kSession.insert(customerDroolData);
		
		kSession.fireAllRules();
		
		Quote quote = (Quote) kSession.getGlobal("quote");
		
		kSession.dispose();
		
		return quote;
	}

	
	
}
