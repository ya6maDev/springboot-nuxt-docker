export const state = () => ({
    person: {}
  })
  
  export const mutations = {
    getPersons: function(state, res) {
      state.persons = { res }
    }
  }
  
  export const actions = {
    async getPersonAction({ commit }) {
      const url = 'http://localhost:8080/api/person/'
      
      const res = await this.$axios.$get(url)
      commit('getPersons', res)
    }
  }
  