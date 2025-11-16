class Solution {
    fun solution(babbling: Array<String>): Int {
        val words = arrayOf("aya","ye","woo","ma")

        var answer: Int = 0
        for(item in babbling){
            var temp = item
            for(word in words){
                temp = temp.replace(word," ")
            }
            if(temp.isBlank()){
                answer++
            }
        }
        return answer
    }
}