<template>
  <div class="about">
    <h1>Event Listing</h1>
    <!-- <EventCard /> -->
    <EventCard v-for="event in events" :key="event.id" :event="event"/>
  </div>
</template>

<script>
import EventCard from '../components/EventCard'
// import axios from 'axios'
import EventService from '../services/EventService'

export default {
  components: {
    EventCard
  },
  data() {
    return {
      events: []
    }
  },
  created() {
    // axios
    // // .get('http://127.0.0.1:8000/record/api') //Django connection refused
    // .get('http://localhost:3000/events')
    EventService.getEvents()
    .then(response=>{
      // console.log(response.data);
      this.events = response.data;
    })
    .catch(error=>{
      console.log('Error happened:'+error);
    })
  }
}
</script>