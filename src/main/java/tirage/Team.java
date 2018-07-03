package tirage;

public class Team {
    private final String  NomTeam;
    private final Continent continent;

    public Team(String nomTeam, Continent continent) {
        NomTeam = nomTeam;
        this.continent = continent;
    }

    private Team(Builder builder) {
        this.NomTeam = builder.NomTeam;
        this.continent = builder.continent;
    }

    public static Builder newTeam() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        return NomTeam != null ? NomTeam.equals(team.NomTeam) : team.NomTeam == null;

    }

    @Override
    public int hashCode() {
        return NomTeam != null ? NomTeam.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Team{" +
                "NomTeam='" + NomTeam + '\'' +
                ", continent=" + continent +
                '}';
    }


    public static final class Builder {
        private String NomTeam;
        private Continent continent;

        private Builder() {
        }

        public Team buildAdfricanTeam() {
            this.continent=continent.AFRICA;
            return new Team(this);
        }
        public Team buildSouthAmerican() {
            this.continent=continent.AMERIC_SUD;
            return new Team(this);
        }
        public Team buildNorthAmerican() {
            this.continent=continent.AMERIC_NORD;
            return new Team(this);
        }
        public Team buildEuropean() {
            this.continent=continent.EUROPE;
            return new Team(this);
        }
        public Team buildAsian() {
            this.continent=continent.ASIA;
            return new Team(this);
        }
        public Team buildAustalian() {
            this.continent=continent.AUSTRALIA;
            return new Team(this);
        }

        public Builder WithNomTeam(String NomTeam) {
            this.NomTeam = NomTeam;
            return this;
        }

    }
}
