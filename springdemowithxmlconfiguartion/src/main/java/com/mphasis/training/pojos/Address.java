package com.mphasis.training.pojos;

public class Address {
		@Override
	public String toString() {
		return "Address [dorno=" + dorno + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}

		private String dorno,street,city,state,pincode;
		public Address() {
			System.out.println("address called");
		}
		public String getDorno() {
			return dorno;
		}

		public void setDorno(String dorno) {
			this.dorno = dorno;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

}
