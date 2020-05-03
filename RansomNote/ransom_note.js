/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    var result = false;
    
    var hash = {};
    var negatives = {};
    
    if (magazine.length >= ransomNote.length) {
        for (var i=0; i<magazine.length; i++) {
            // Increment count for each magazine letter.
            hash[magazine[i]] = hash[magazine[i]] ? hash[magazine[i]] + 1 : 1;

            if (hash[magazine[i]] >= 0) {
                // This is a valid use of a letter.
                delete negatives[magazine[i]];
            }
            
            if (i < ransomNote.length) {
                // Decrement count for each used ransom note letter.
                hash[ransomNote[i]] = hash[ransomNote[i]] ? hash[ransomNote[i]] - 1 : -1;
                
                if (hash[ransomNote[i]] < 0) {
                    // This is a potential overuse of a letter.
                    negatives[ransomNote[i]] = 1;
                }
            }
        }
        
        result = Object.keys(negatives).length === 0;
    }
    
    return result;
};
