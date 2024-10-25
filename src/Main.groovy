static void main(String[] args) {
  def inputData = [1, 3, 4, 5, 1, 5, 4] as ArrayList<Integer>
  def outputData = [:] as HashMap<Integer, Integer>

  for (Integer key : inputData) {
    outputData.put(key, outputData.getOrDefault(key, 0) + 1)
  }

  println inputData
  println outputData
}