/**
 * @param {number} n
 * @return {Function} counter
 */
function createCounter(start) {
    let cnt=start;
    
    return function() {
        return cnt++;
        
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */