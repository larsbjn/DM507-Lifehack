const args = process.argv

// Set arguments: a, b, k, i
const a = parseFloat(args[2])
const b = parseFloat(args[3])
const k = parseFloat(args[4])
const i = parseFloat(args[5])

calc(a, b, k, i)

function calc(a, b, k, i) {
	let recurrenceText = "Error: ";
	if (isNaN(a))
		recurrenceText += "Invalid value for \\(a\\)";
	else if (isNaN(b))
		recurrenceText += "Invalid value for \\(b\\)";
	else if (isNaN(k))
		recurrenceText += "Invalid value for \\(k\\)";
	else if (isNaN(i))
		recurrenceText += "Invalid value for \\(i\\)";
	else if (a < 0)
		recurrenceText += "\\(a\\) must be non-negative";
	else if (b <= 1)
		recurrenceText += "\\(b\\) must be greater than 1";
	else if (k < 0)
		recurrenceText += "\\(k\\) must be at least 0";
	else if (i < 0)
		recurrenceText += "\\(i\\) must be at least 0";
	else
		recurrenceText = "\\(T(n) \\: = \\: " + (a != 1 ? a : "") + " \\: T(n" + (b != 1 ? " / " + b : "") + ") \\, + \\, \u0398(" + formatPolyLog(k, i) + ").\\)";
    // recurrenceMath.render(recurrenceText);
    console.log('Recurrence text', recurrenceText)
	if (recurrenceText.substring(0, 6) == "Error:") {
		console.error("Error")
		return;
	}
	
	var p = Math.log(a) / Math.log(b);
	var result = "\\(T \\: \u2208 \\: \u0398(";
	if (floatEquals(p, k))
		result += formatPolyLog(k, i + 1);
	else if (p < k)
		result += formatPolyLog(k, i);
	else if (p > k) {
		if (floatEquals(Math.round(p), p))
			result += formatPolyLog(Math.round(p), 0);
		else
			result += formatPolyLog("\\log_{" + b + "} " + a, 0) + ") \\approx \u0398(" + formatPolyLog(p.toFixed(3), 0);
	} else
		result = null;
	if (result != null)
		result += ").\\)";
	else
		result = "Arithmetic error";
	console.log('Result: ' + result)
}

// Returns a natural TeX string for the polylogarithmic expression (n^k log^i n).
function formatPolyLog(k, i) {
	// Process n^k
	var result = null;
	if (typeof k == "number") {
		if (k == 0 && i != 0)
			result = "";
		else if (k == 0 && i == 0)
			result = "1";
		else if (k == 0.5)
			result = "\\sqrt{n}";
		else if (k == 1)
			result = "n";
		else
			k = k.toString();
	}
	if (result != null);
	else if (typeof k == "string")
		result = "n^{" + k + "}";
	else
		throw "Invalid argument";
	
	// Process log^i n
	if (i != 0) {
		if (result != "")
			result += " ";
		result += "\\log";
		if (i != 1)
			result += "^{" + i + "}";
		result += " n";
	}
	
	return result;
}


function floatEquals(x, y) {
	return Math.abs(x - y) < 1e-9;
}