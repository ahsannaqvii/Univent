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

export const extractDate = (date) => {
  date = moment(date).utc().format("YYYY-MM-DD");

  return date;
};

export function getMonthName(monthNumber) {
  const date = new Date();
  date.setMonth(monthNumber - 1);

  return date.toLocaleString("en-US", { month: "short" });
}

export function extractCurrentEvents(state) {
  let tempData = state.eventData.filter(
    (element) => element.eventDate >= new Date().toISOString().split("T")[0]
  );
  return tempData;
}
// Path: Frontend\src\store\modules\events.js
