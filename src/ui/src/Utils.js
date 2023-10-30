export function getCurrency(number) {
  const formatter = new Intl.NumberFormat('en-US', {
    style: 'currency',
    currency: 'INR',});
  return formatter.format(number)
}