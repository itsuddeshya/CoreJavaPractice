package InnerClass;

public class University {
    private int uniId;
    private String uniName;

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public String toString() {
        return "University{" +
                "uniId=" + uniId +
                ", uniName='" + uniName + '\'' +
                '}';
    }

    public class Department{
        private int depID;
        private String depName;

        public int getDepID() {
            return depID;
        }

        public void setDepID(int depID) {
            this.depID = depID;
        }

        public String getDepName() {
            return depName;
        }

        public void setDepName(String depName) {
            this.depName = depName;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "depID=" + depID +
                    ", depName='" + depName + '\'' +
                    '}';
        }
    }
}
