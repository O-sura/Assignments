const calculator = document.querySelector('.calculator')
const keys = calculator.querySelector('.calc__keys')
const display = document.querySelector('.calc__display')

keys.addEventListener('click', e => {
 if (e.target.matches('button')) {
   const key = e.target
    const action = key.dataset.action
    const btn_val = key.textContent
    const calc_dis_num = display.textContent
    const previousKeyType = calculator.dataset.previousKeyType
    if (!action) {
        if (calc_dis_num === '0'|| previousKeyType === 'operator') {
            display.textContent = btn_val
          } else {
            display.textContent = calc_dis_num + btn_val
          }
      }
      if (
        action === 'add' ||
        action === 'sub' ||
        action === 'mult' ||
        action === 'div'
      ) {
        key.classList.add('is-depressed')
        calculator.dataset.previousKeyType = 'operator'
        calculator.dataset.firstValue = calc_dis_num
        calculator.dataset.operator = action
      }
      if (action === 'decimal') {
        if(!calc_dis_num.includes("."))
          display.textContent = calc_dis_num + '.'
      }
      
      if (action === 'clear') {
        display.textContent = "0"
        previousKeyType = null

      }
      
      if (action === 'calculate') {
        const firstVal = calculator.dataset.firstValue
        const op = calculator.dataset.operator
        const secondVal = calc_dis_num
  
  display.textContent = calculate(firstVal, op, secondVal)
      }
      Array.from(key.parentNode.children)
      .forEach(k => k.classList.remove('is-depressed'))
 }
})

const calculate = (num1, op, num2) => {
    // Perform calculation and return calculated value
    let result = ''
  
  if (op === 'add') {
    result = parseFloat(num1) + parseFloat(num2)
  } else if (op === 'sub') {
    result = parseFloat(num1) - parseFloat(num2)
  } else if (op === 'mult') {
    result = parseFloat(num1) * parseFloat(num2)
  } else if (op === 'div') {
    result = parseFloat(num1) / parseFloat(num2)
  }
  
  return result
  }