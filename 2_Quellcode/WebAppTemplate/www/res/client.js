
console.log("ready")

async function main()
{
	//--- getting data from the server ---//
	let data = await (await fetch("/getdata")).json()
	console.log(data)

	//--- posting data to the server ---//
	let response = await fetch("/postdata", {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify(data) // body data type must match "Content-Type" header
	});
	console.log("HTTP status code:", response.status)
}
main()