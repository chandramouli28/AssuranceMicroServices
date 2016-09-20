package com.assurance.quotegeneration.utils;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;


/**
 * Utility class to get KieSession object from KieServices factory
 * @author Srinivas Kondapaneni
 *
 */
@Service("droolsEngineUtil")
public class DroolsEngineUtil {
	
	/**
	 * Method to get ksession object to use in droolsEngine
	 * @return KieSession
	 */
	public KieSession getKieSession() {
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		return kSession;
	}
}
