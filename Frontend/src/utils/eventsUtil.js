import moment from "moment";

 export const clearData = (data) => {
  data.forEach((element) => {
    delete element.union;
    delete element.registration;
  });
  return data;
};

export const UniqueEventType = (data) => {
    let uniqueEventTypes = [];
    data.forEach((element) => {
      if (!uniqueEventTypes.includes(element.eventType)) {
        uniqueEventTypes.push(element.eventType);
      }
    });
    return uniqueEventTypes;
};

export const extractDate = (data) => {
    data.forEach((element) => {
        element.eventDate = moment(element.eventDate).utc().format("YYYY-MM-DD");
    });
    return data;
}

export  function getMonthName(monthNumber) {
    const date = new Date();
    date.setMonth(monthNumber - 1);
  
    return date.toLocaleString('en-US', { month: 'short' });
  }
// Path: Frontend\src\store\modules\events.js