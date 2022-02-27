package com.example.ApiJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Legislator {
    @Id
        private String cid;
        private String firstlast;
        private String lastname;
        private String party;
        private String office;
        private String gender;
        private String first_elected;
        private String phone;
        private String votesmart_id;
        private String feccandid;
        private Date birthdate;

    public Legislator() {
    }

    public Legislator(String cid, String firstlast, String lastname, String party, String office, String gender, String first_elected, String phone,
                      String votesmart_id,
                      String feccandid,
                      Date birthdate) {
            this.cid = cid;
            this.firstlast = firstlast;
            this.lastname = lastname;
            this.party = party;
            this.office = office;
            this.gender = gender;
            this.first_elected = first_elected;
            this.phone = phone;
            this.votesmart_id = votesmart_id;
            this.feccandid = feccandid;
            this.birthdate = birthdate;
        }

    public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getFirstlast() {
            return firstlast;
        }

        public void setFirstlast(String firstlast) {
            this.firstlast = firstlast;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getParty() {
            return party;
        }

        public void setParty(String party) {
            this.party = party;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getFirst_elected() {
            return first_elected;
        }

        public void setFirst_elected(String first_elected) {
            this.first_elected = first_elected;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getVotesmart_id() {
            return votesmart_id;
        }

        public void setVotesmart_id(String votesmart_id) {
            this.votesmart_id = votesmart_id;
        }

        public String getFeccandid() {
            return feccandid;
        }

        public void setFeccandid(String feccandid) {
            this.feccandid = feccandid;
        }

        public Date getBirthdate() {
            return birthdate;
        }

        public void setBirthdate(Date birthdate) {
            this.birthdate = birthdate;
        }

        @Override
        public String toString() {
            return "Legislator{" +
                    "cid='" + cid + '\'' +
                    ", firstlast='" + firstlast + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", party='" + party + '\'' +
                    ", office='" + office + '\'' +
                    ", gender='" + gender + '\'' +
                    ", first_elected='" + first_elected + '\'' +
                    ", phone='" + phone + '\'' +
                    ", votesmart_id='" + votesmart_id + '\'' +
                    ", feccandid='" + feccandid + '\'' +
                    ", birthdate=" + birthdate +
                    '}';

    }
}
