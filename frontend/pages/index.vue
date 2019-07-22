<template>
  <div class="container">
    <b-table striped hover :items="persons"></b-table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      persons: []
    };
  },
  created() {
    this.getPersons()
  },
  methods: {
    getPersons: function() {
      this.$store
        .dispatch("person/getPersonAction", {})
        .then(() => {
          this.persons = this.$store.state.person.persons.res
        });
    }
  }
};
</script>