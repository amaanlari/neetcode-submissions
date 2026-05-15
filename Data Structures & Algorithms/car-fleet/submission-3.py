class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        data = sorted(zip(position, speed), key=lambda x: x[0], reverse=True)

        last_time_delta = (target - data[0][0]) / data[0][1]
        fleet_len = 1
        for idx in range(1, len(data)):
            tmp = (target - data[idx][0]) / data[idx][1]
            if last_time_delta < tmp:
                last_time_delta = tmp
                fleet_len += 1

        return fleet_len
