// const RULES={
//     required: (value) => !!value || false,
//     email: (value) => {
//       const pattern =
//         /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
//       return pattern.test(value) || false;
//     },
//     passwordLength: (v) => {
//       v => v.length <= 25 || 'Max 25 characters';
//     }
// }

// export default RULES
const RULES={
  required: (value) => !!value || "Required",
  email: (value) => {
    const pattern =
      /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return pattern.test(value) || "Invalid email.";
  },
}

export default RULES