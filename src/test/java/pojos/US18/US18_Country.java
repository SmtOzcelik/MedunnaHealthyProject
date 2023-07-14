package pojos.US18;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US18_Country {
        private int id;
        public  String name;

        public US18_Country(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public US18_Country() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "US18_Country{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

