package com.sdet.basics;

public class CenturaHospitals implements UsHospitals , UkHospitals , IndianHospitals
{

	@Override
	public void emergencyServices() 
	{
		System.out.println("Centura Hospitals -- Emergency Services");
		
	}

	@Override
	public void OPDServices() {
		System.out.println("Centura Hospitals -- OPD Services");
		
	}

	@Override
	public void IPDServices() {
		System.out.println("Centura Hospitals -- IPD Services");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Centura Hospitals -- NeuroServices");
		
	}

	@Override
	public void orthopedicServices() {
		 System.out.println("Centura Hospitals -- OrthopedicServices");
		
	}

	@Override
	public void pathologyServices() {
		System.out.println("Centura Hospitals -- pathologyServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("Centura Hospitals -- physioServices");
		
	}

	@Override
	public void clinicalServices() {
		System.out.println("Centura Hospitals -- clinicalServices");
	}
	

}
