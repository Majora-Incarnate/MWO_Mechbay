#include "ComponentType.h"

enum class ComponentType::ComponentEnum {
    ACTUATOR, WEAPON, AMMO, EQUIPMENT, HEAT_SINK, JUMP_JET, ARMOR, INTERNAL, CASE, ENGINE, GYRO, MYOMER, COCKPIT
};

ComponentType::ComponentType(const ComponentType::ComponentEnum & componentType, const std::string & fullName)
    :name(fullName), enumId(componentType) {
}

const ComponentType ComponentType::ACTUATOR(ComponentType::ComponentEnum::ACTUATOR, "Actuator");
const ComponentType ComponentType::WEAPON(ComponentType::ComponentEnum::WEAPON, "Weapon");
const ComponentType ComponentType::AMMO(ComponentType::ComponentEnum::AMMO, "Ammo");
const ComponentType ComponentType::EQUIPMENT(ComponentType::ComponentEnum::EQUIPMENT, "Equipment");
const ComponentType ComponentType::HEAT_SINK(ComponentType::ComponentEnum::HEAT_SINK, "Heat Sink");
const ComponentType ComponentType::JUMP_JET(ComponentType::ComponentEnum::JUMP_JET, "Jump Jet");
const ComponentType ComponentType::ARMOR(ComponentType::ComponentEnum::ARMOR, "Armor");
const ComponentType ComponentType::INTERNAL(ComponentType::ComponentEnum::INTERNAL, "Internal");
const ComponentType ComponentType::CASE(ComponentType::ComponentEnum::CASE, "CASE");
const ComponentType ComponentType::ENGINE(ComponentType::ComponentEnum::ENGINE, "Engine");
const ComponentType ComponentType::GYRO(ComponentType::ComponentEnum::GYRO, "Gyro");
const ComponentType ComponentType::MYOMER(ComponentType::ComponentEnum::MYOMER, "Myomer");
const ComponentType ComponentType::COCKPIT(ComponentType::ComponentEnum::COCKPIT, "Cockpit");
