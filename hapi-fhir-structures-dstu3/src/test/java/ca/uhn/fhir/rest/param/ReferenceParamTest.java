package ca.uhn.fhir.rest.param;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.util.TestUtil;

public class ReferenceParamTest {

	private FhirContext ourCtx = FhirContext.forDstu3();

	@Test
	public void testWithResourceType() {
		
		ReferenceParam rp = new ReferenceParam();
		rp.setValueAsQueryToken(ourCtx, null, null, "Location/123");
		assertEquals("Location", rp.getResourceType());
		assertEquals("123", rp.getIdPart());
		
	}
	
	@Test
	public void testWithResourceTypeAsQualifier() {
		
		ReferenceParam rp = new ReferenceParam();
		rp.setValueAsQueryToken(ourCtx, null, ":Location", "123");
		assertEquals("Location", rp.getResourceType());
		assertEquals("123", rp.getIdPart());
		
	}

	@AfterClass
	public static void afterClassClearContext() {
		TestUtil.clearAllStaticFieldsForUnitTest();
	}

}
